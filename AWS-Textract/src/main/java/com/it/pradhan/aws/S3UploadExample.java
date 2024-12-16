package com.it.pradhan.aws;

import java.nio.file.Paths;

import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class S3UploadExample {

	public static void main(String[] args) {
		S3Client s3 = S3Client.create();
		String bucketName = "your-bucket-name";
		String keyName = "your-file-key";
		String filePath = "path/to/your/file.txt";

		PutObjectRequest request = PutObjectRequest.builder().bucket(bucketName).key(keyName).build();

		s3.putObject(request, RequestBody.fromFile(Paths.get(filePath)));

		System.out.println("File uploaded to S3 successfully.");

	}
}