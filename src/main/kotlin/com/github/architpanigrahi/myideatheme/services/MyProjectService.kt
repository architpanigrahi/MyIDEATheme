package com.github.architpanigrahi.myideatheme.services

import com.intellij.openapi.project.Project
import com.github.architpanigrahi.myideatheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
