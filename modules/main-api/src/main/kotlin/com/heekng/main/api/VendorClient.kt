package com.heekng.main.api

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component
import org.springframework.web.multipart.MultipartFile

@Component
class VendorClient(
        private val vendorApi: VendorApi,
        private val objectMapper: ObjectMapper
) {
    fun postMultipartFormData(
            mapValues: Map<String, Any>,
            longValues: List<Long>,
            fileValue: MultipartFile,
            stringValue: String
    ) {
        val mapValuesByte = objectMapper.writeValueAsBytes(mapValues)
        val longValuesByte = objectMapper.writeValueAsBytes(longValues)

        vendorApi.postMultipartFormData(
                CustomMultipartFile(mapValuesByte),
                CustomMultipartFile(longValuesByte),
                fileValue,
                stringValue
        )
    }
}
