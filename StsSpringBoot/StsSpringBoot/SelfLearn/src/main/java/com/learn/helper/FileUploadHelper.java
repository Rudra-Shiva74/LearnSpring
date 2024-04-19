package com.learn.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String uploaddir = "D:\\StsSpringBoot\\SelfLearn\\src\\main\\resources\\img";

	public boolean uploadfile(MultipartFile file) {
		boolean f = false;
		try {
			Files.copy(file.getInputStream(), Paths.get(uploaddir + File.separator + file.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			f = true;
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return f;
	}

}
