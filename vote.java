BEGIN
   SET value to 26
   IF age is greater than 21 and age is less than 32 THEN
   START IF
       PRINT"age is eligible for IAS"
   END IF
   ELSE
   START ELSE
        PRINT "age is not eligible for IAS"
   END ELSE
END
