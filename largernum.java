BEGIN
   SET x to 5
   SET y to 10
   SET z to 15
   IF x is greater than y and x is greater than z THEN
   START IF 
       PRINT x+"largest number"
   END IF
   ELSE IF y is greater than z THEN
   START ELSE IF
       PRINT y+"is largest number"
   END ELSE IF 
   ELSE
   START ELSE
       PRINT Z+" is largest number"
   END ELSE
END
