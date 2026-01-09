package io.river.ec2_s3_deploy_prac

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val s3Service: S3Service,
    @Value("\${custom.secret-word}")
    private val secretWord: String
) {

    @GetMapping("/")
    fun main(): String {
        return "[secretWord: ${secretWord}]"
    }

    @GetMapping("/buckets")
    fun buckets(): List<String> {

        return s3Service.getBucketNames()
    }
}