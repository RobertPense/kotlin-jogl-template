package de.geniusatwork.robse.jogl

import com.jogamp.opengl.*
import com.jogamp.opengl.awt.GLCanvas

import javax.swing.JFrame

class Game : JFrame("Minimal OpenGL"), GLEventListener {

    private val width1 = 800
    private val height1 = 600

    init {
        val profile = GLProfile.get(GLProfile.GL4)
        val capabilities = GLCapabilities(profile)
        val canvas = GLCanvas(capabilities)
        canvas.addGLEventListener(this)

        this.name = "Minimal OpenGL"
        this.contentPane.add(canvas)
        this.setSize(width1, height1)
        this.setLocationRelativeTo(null)
        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.isVisible = true
        this.isResizable = false

        canvas.requestFocusInWindow()
    }

    fun play() {}

    override fun display(drawable: GLAutoDrawable) {
        val gl = drawable.gl.gL4
        gl.glClear(GL4.GL_COLOR_BUFFER_BIT or GL4.GL_DEPTH_BUFFER_BIT)

        // call your draw code here

        gl.glFlush()
    }

    override fun dispose(drawable: GLAutoDrawable) {}

    override fun init(drawable: GLAutoDrawable) {
        val gl = drawable.gl.gL4
        gl.glClearColor(0.392f, 0.584f, 0.929f, 1.0f)
    }

    override fun reshape(drawable: GLAutoDrawable, x: Int, y: Int, width: Int, height: Int) {}

    companion object {
        private val serialVersionUID = 1L
    }
}