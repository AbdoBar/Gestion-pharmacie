 

package com.mycompany.certaficat_plana;

import java.security.*;
import java.security.cert.*;
import java.util.Date;

// Retrieve user input from panel components
String name = textFieldName.getText();
String organization = textFieldOrganization.getText();
Date expirationDate = dateChooserExpirationDate.getDate();

// Generate certificate
X509Certificate certificate = null;
try {
    // Create a KeyPair for the certificate
    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
    keyPairGenerator.initialize(2048);
    KeyPair keyPair = keyPairGenerator.generateKeyPair();

    // Create the certificate
    X509v3CertificateBuilder certificateBuilder = new JcaX509v3CertificateBuilder( 
            new X500Name("CN=" + name + ", O=" + organization),
            BigInteger.ONE, // Serial number
            new Date(), // Start date
            expirationDate, // End date
            new X500Name("CN=" + name + ", O=" + organization),
            keyPair.getPublic());

    // Sign the certificate with a self-signed certificate
    ContentSigner contentSigner = new JcaContentSignerBuilder("SHA256WithRSA").build(keyPair.getPrivate());
    X509CertificateHolder certificateHolder = certificateBuilder.build(contentSigner);
    certificate = new JcaX509CertificateConverter().getCertificate(certificateHolder);
} catch (Exception e) {
    e.printStackTrace();
}

// Use the generated certificate as needed
