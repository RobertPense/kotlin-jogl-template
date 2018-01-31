package de.geniusatwork.robse.jogl

object Launcher {
    @JvmStatic fun main(arg: Array<String>) {
        val game = Game()
        game.play()
    }
}
