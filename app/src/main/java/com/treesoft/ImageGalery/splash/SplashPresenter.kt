package com.treesoft.ImageGalery.splash

class SplashPresenter {
    private var view: SplashView? = null

    fun attach(view: SplashView) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }
}