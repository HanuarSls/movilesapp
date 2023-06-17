package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController


/** Aplicacion hecha gracias al curso de udemy en el cual tome inspiracion para poder adaptarla a mis necesidades de la tarea final**/
class MainActivity : AppCompatActivity() {
    // declaramos navcontroller para administrar la navegación entre los fragmentos de la aplicacion.

    private lateinit var navController: NavController

    // se realiza la inicialización de la actividad

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se obtiene una referencia al fragmento principal de navegacion

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        //configuramos la barra de acción, permite que la barra de acción muestre automáticamente los íconos de navegación
        // y controle la navegación entre fragmentos.
        setupActionBarWithNavController(navController)

    }
    //Metodo que se sobrescribe para permitir la navegación
    // hacia arriba cuando se presiona el botón de retroceso en la barra de acción.
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}