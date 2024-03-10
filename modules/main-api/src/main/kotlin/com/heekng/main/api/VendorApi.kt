package com.heekng.main.api

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.multipart.MultipartFile

@FeignClient(value = "vendor-api", url = "http://localhost:8080")
interface VendorApi {
    @RequestMapping(method = [RequestMethod.POST], value = ["/v1/vendor/api/post"], consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun postMultipartFormData(
            @RequestPart mapValues: MultipartFile,
            @RequestPart longValues: MultipartFile,
            @RequestPart fileValue: MultipartFile,
            @RequestParam stringValue: String
    ): ResponseEntity<*>?
}
