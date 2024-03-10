package com.heekng.main.api

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.mock.web.MockMultipartFile
import org.springframework.web.multipart.MultipartFile

@SpringBootTest
class VendorClientTest(@Autowired private val vendorClient: VendorClient) {

    @DisplayName("multipart-form-data 테스트")
    @Test
    fun multipartFormData_테스트() {
        val mapValues: Map<String, Any> = mapOf(Pair("aaa", Pair("bbb", 123L)))
        val longValues: List<Long> = listOf(111L, 222L, 333L)
        val fileValue: MultipartFile = MockMultipartFile("name", "name.png", MediaType.IMAGE_PNG_VALUE, "thumbnail".byteInputStream())
        val stringValue: String = "asdf"
        vendorClient.postMultipartFormData(mapValues, longValues, fileValue, stringValue)
    }
}
