package com.pcitc.sso.server.uic.system.account.service;

import java.util.UUID;

import com.pcitc.sso.common.utils.Signer;


public class CredentialGenerator {

    /**
     * 生成AccessKey **
     */
    public static String generateAccessKey() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 生成SecurityKey **
     */
    public static String generateSecretKey() {
        return Signer.sign(String.valueOf(System.currentTimeMillis()).getBytes(), String.valueOf(Math.random()));
    }

}


