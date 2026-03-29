package com.example.mclinc.ui.mainFragments.home.appointment_booking

import android.app.Application
import com.example.mclinc.base.BaseViewModel
import com.example.mclinc.model.User

class DoctorDetailsViewModel(application: Application) : BaseViewModel(application) {

    private var doctor: User = User()

    fun initDoctor(doctorDetails: User) {
        doctor = doctorDetails
    }

    fun getDoctor(): User {
        return doctor
    }

}
