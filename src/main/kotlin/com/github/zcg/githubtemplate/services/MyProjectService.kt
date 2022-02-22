package com.github.zcg.githubtemplate.services

import com.intellij.openapi.project.Project
import com.github.zcg.githubtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
