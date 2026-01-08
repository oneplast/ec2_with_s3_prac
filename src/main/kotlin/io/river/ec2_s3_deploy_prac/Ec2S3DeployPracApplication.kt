package io.river.ec2_s3_deploy_prac

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Ec2S3DeployPracApplication

fun main(args: Array<String>) {
    runApplication<Ec2S3DeployPracApplication>(*args)
}
