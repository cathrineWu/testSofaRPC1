package com.example.testsofaboot2;

public class HelloSyncServiceImpl implements HelloSyncService{
    @Override
    public String saySync(String string) {
        return string;
    }
}
