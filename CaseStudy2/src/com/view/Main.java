package com.view;

import com.repository.LoadingFile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to library");
        LoadingFile.loadManageFile();
        LoginMenu.openMenu();

    }
}
