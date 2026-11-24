plugins {
    id("dev.prism")
}

group = "com.leclowndu93150"
version = "1.0.0"

prism {
    metadata {
        modId = "minecraft2shellpatcher"
        name = "Minecraft2Shell Patcher"
        description = "Disables TrueType hinting bytecode in font rendering to block the minecraft2shell FreeType exploit."
        license = "MIT"
        author("Leclowndu93150")
    }

    publishing {
        changelogFile = "CHANGELOG.md"
        type = STABLE

        curseforge {
            accessToken = providers.environmentVariable("CURSEFORGE_TOKEN")
            projectId = "1828783"
        }
    }

    version("26.3") {
        fabric {
            loaderVersion = "0.19.5"
        }

        neoforge {
            loaderVersion = "26.3.0.102"
        }
    }
}
