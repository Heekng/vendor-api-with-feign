package com.heekng.main.api

import org.springframework.http.MediaType
import org.springframework.web.multipart.MultipartFile
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

class CustomMultipartFile(private val input: ByteArray): MultipartFile {

    override fun getInputStream(): InputStream {
        return ByteArrayInputStream(input)
    }

    override fun getName(): String {
        return ""
    }

    override fun getOriginalFilename(): String? {
        return ""
    }

    override fun getContentType(): String {
        return MediaType.APPLICATION_JSON_VALUE
    }

    override fun isEmpty(): Boolean {
        return input.isEmpty()
    }

    override fun getSize(): Long {
        return input.size.toLong()
    }

    override fun getBytes(): ByteArray {
        return input
    }

    override fun transferTo(dest: File) {
        FileOutputStream(dest).use { fos ->
            fos.write(input)
        }
    }
}
