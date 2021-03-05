package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.shop.service.Impl.RndServiceImplV1_Answer;

public class FileWriter_05 {
	
	public static void main(String[] args) throws IOException {
		
		RndServiceImplV1_Answer rsiV1 = new RndServiceImplV1_Answer();
		
		rsiV1.makeRnd();
		rsiV1.saveFileRnd();
	}
}
