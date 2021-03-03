package com.github.edivera.myintellijplugin.services

import com.github.edivera.myintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
