package com.example.mclinc.ui.mainFragments.stats

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mclinc.base.ViewModelFactory
import com.example.mclinc.ui.adapter.StatsListAdapter
import com.example.mclinc.databinding.FragmentStatisticsBinding
import com.example.mclinc.model.HealthData
import com.example.mclinc.utils.Constants
import com.example.mclinc.utils.Logger
import java.util.*


class StatisticsFragment : Fragment() {

    private var _binding: FragmentStatisticsBinding? = null
    private val binding get() = _binding!!
    private lateinit var sharedPreference: SharedPreferences
    private val statisticsViewModel by viewModels<StatisticsViewModel> { ViewModelFactory() }
    private lateinit var statsListAdapter: StatsListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        sharedPreference =
            requireActivity().getSharedPreferences(Constants.UserData, Context.MODE_PRIVATE)

        initObserver()
        initView()

        return binding.root
    }

    private fun initView() {
        binding.run {
            fabCircle.setOnClickListener {
                val action = StatisticsFragmentDirections.actionStatsToAddStatsDataFragment(
                    HealthData(null)
                )
                findNavController().navigate(action)
            }
            statsListAdapter = StatsListAdapter {
                val action = StatisticsFragmentDirections.actionStatsToAddStatsDataFragment(it)
                findNavController().navigate(action)
            }
            recyclerView.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = statsListAdapter
            }
        }
    }

    private fun initObserver() {
        statisticsViewModel.run {
            getDataFromSharedPreference(sharedPreference)
            userLiveData.observe(viewLifecycleOwner) {
                setStatsList()
            }
            statsList.observe(viewLifecycleOwner) {
                Logger.debugLog("StatsList from statsFrag: $it")
                if (it != null)
                    statsListAdapter.addItems(it)
            }
        }
    }

}