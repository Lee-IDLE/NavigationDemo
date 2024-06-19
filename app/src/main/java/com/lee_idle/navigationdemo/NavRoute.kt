package com.lee_idle.navigationdemo

sealed class NavRoute(val route: String) {
    object Home : NavRoute("home")
    object Welcom : NavRoute("welcome")
    object Profile: NavRoute("profile")
}