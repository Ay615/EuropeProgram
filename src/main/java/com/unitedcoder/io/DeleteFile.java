package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        //delete an existing file
        //boolean isFileDeleted= FileUtils.deleteQuietly(new File("test-result"
               // + File.separator +"result.txt"));
        boolean isFileDeleted= FileUtils.deleteQuietly(new File("test-Result"));
        System.out.println("File Deleted "+isFileDeleted);


    }
}
