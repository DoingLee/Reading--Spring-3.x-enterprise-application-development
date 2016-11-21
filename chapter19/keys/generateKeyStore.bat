call generateKeyPair.bat server serverpass serverStore.jks storepass serverKey.rsa
call generateKeyPair.bat client  clientpass  clientStore.jks storepass clientKey.rsa
keytool -import -alias server -file serverKey.rsa -keystore clientStore.jks -storepass storepass 
-noprompt
keytool -import -alias client -file clientKey.rsa -keystore serverStore.jks -storepass storepass -noprompt
