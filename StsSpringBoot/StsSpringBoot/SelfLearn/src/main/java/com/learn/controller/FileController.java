package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.learn.helper.FileUploadHelper;

@RestController
public class FileController {

	@Autowired
	private FileUploadHelper fileUploadHelper;

	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		if (file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please upload the file");
		}
		boolean f = fileUploadHelper.uploadfile(file);
		if (f) {
			System.out.println(f);
			return ResponseEntity.ok("File Uploaded");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("FIle is not uploaded");
	}
}
