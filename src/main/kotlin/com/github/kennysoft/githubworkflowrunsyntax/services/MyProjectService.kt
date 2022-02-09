package com.github.kennysoft.githubworkflowrunsyntax.services

import com.intellij.openapi.project.Project
import com.github.kennysoft.githubworkflowrunsyntax.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
