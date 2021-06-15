package fr.eni.viewmodellivedatademonstration.view_model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel : ViewModel() {

    var compteur = 0;//MutableLiveData<Int>()

    /*init {
        compteur.value = 0
    }*/

    fun plusUn() {
        //compteur.value = (compteur.value)?.plus(1)
        compteur++
    }
}