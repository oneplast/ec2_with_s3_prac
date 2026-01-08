package io.river.ec2_s3_deploy_prac

interface S3Service {

    fun getBucketNames(): List<String>
}