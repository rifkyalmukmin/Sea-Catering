package com.example.cateringapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

import com.example.seacatering.ui.theme.onboarding.components.OnboardingScreen

const val ONBOARDING_ROUTE = "onboarding"

fun NavGraphBuilder.onboardingScreen(
    onComplete: () -> Unit
) {
    composable(ONBOARDING_ROUTE) {
        OnboardingScreen(onComplete = onComplete)
    }
}