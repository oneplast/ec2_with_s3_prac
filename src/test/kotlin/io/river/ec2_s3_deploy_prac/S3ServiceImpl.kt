package io.river.ec2_s3_deploy_prac

import org.springframework.stereotype.Service

@Service
class S3ServiceImpl : S3Service {

    override fun getBucketNames(): List<String> {
        return listOf("")
    }
}