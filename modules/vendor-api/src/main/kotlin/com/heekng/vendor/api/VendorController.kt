package com.heekng.vendor.api

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/v1/vendor/api")
class VendorController {
    private val log = LoggerFactory.getLogger(javaClass)

    @PostMapping(value = ["/post"], consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun postMultipartFormData(
            @RequestPart mapValues: Map<String, Any>,
            @RequestPart longValues: List<Long>,
            @RequestPart fileValue: MultipartFile,
            @RequestParam stringValue: String
    ): ResponseEntity<Any> {
        log.info("mapValues {}", mapValues)
        log.info("longValues {}", longValues)
        log.info("fileValue {}", fileValue)
        log.info("stringValue {}", stringValue)
        return ResponseEntity.ok(null)
    }

}
