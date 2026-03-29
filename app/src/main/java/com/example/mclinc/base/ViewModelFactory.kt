package com.example.mclinc.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mclinc.ui.auth.forgotPassword.ForgotPasswordViewModel
import com.example.mclinc.ui.auth.signInScreen.SignInViewModel
import com.example.mclinc.ui.auth.signUpScreen.SecondScreen.SignUpSecondViewModel
import com.example.mclinc.ui.auth.signUpScreen.firstScreen.SignUpFirstViewModel
import com.example.mclinc.ui.mainFragments.appointments.MyAppointmentsViewModel
import com.example.mclinc.ui.mainFragments.appointments.PatientQueueViewModel
import com.example.mclinc.ui.mainFragments.home.HomeViewModel
import com.example.mclinc.ui.mainFragments.home.appointment_booking.AppointmentBookingViewModel
import com.example.mclinc.ui.mainFragments.home.appointment_booking.DoctorDetailsViewModel
import com.example.mclinc.ui.mainFragments.settings.SettingsViewModel
import com.example.mclinc.ui.mainFragments.settings.profile.ProfileViewModel
import com.example.mclinc.ui.mainFragments.stats.AddStatsDataViewModel
import com.example.mclinc.ui.mainFragments.stats.StatisticsViewModel

class ViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T =
        with(modelClass) {
            // Get the Application object from extras
            val application = checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY])
            when {
                isAssignableFrom(HomeViewModel::class.java) -> {
                    HomeViewModel(application)
                }
                isAssignableFrom(SignUpFirstViewModel::class.java) -> {
                    SignUpFirstViewModel(application)
                }
                isAssignableFrom(SignUpSecondViewModel::class.java) -> {
                    SignUpSecondViewModel(application)
                }
                isAssignableFrom(SignInViewModel::class.java) -> {
                    SignInViewModel(application)
                }
                isAssignableFrom(ForgotPasswordViewModel::class.java) -> {
                    ForgotPasswordViewModel(application)
                }
                isAssignableFrom(AppointmentBookingViewModel::class.java) -> {
                    AppointmentBookingViewModel(application)
                }
                isAssignableFrom(DoctorDetailsViewModel::class.java) -> {
                    DoctorDetailsViewModel(application)
                }
                isAssignableFrom(MyAppointmentsViewModel::class.java) -> {
                    MyAppointmentsViewModel(application)
                }
                isAssignableFrom(PatientQueueViewModel::class.java) -> {
                    PatientQueueViewModel(application)
                }
                isAssignableFrom(SettingsViewModel::class.java) -> {
                    SettingsViewModel(application)
                }
                isAssignableFrom(ProfileViewModel::class.java) -> {
                    ProfileViewModel(application)
                }
                isAssignableFrom(AddStatsDataViewModel::class.java) -> {
                    AddStatsDataViewModel(application)
                }
                isAssignableFrom(StatisticsViewModel::class.java) -> {
                    StatisticsViewModel(application)
                }
//                isAssignableFrom(FirebaseViewModel::class.java) -> {
//                    FirebaseViewModel()
//                }
//                isAssignableFrom(CustomizeQRViewModel::class.java) -> {
//                    CustomizeQRViewModel(application)
//                }

                else -> throw IllegalArgumentException("Unknown ViewModel class")
            }
        } as T
}