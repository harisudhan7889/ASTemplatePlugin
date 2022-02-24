package com.github.harisudhan7889.astemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.harisudhan7889.astemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
