BEGIN
  SET marks to 39
  IF marks  are greater than or equal to 90 and marks are less than or equal to 100 THEN
  START IF
    PRINT"student got first rank"
  END IF
  ELSE IF marks are greater than or equal to 75 and marks are less than or equal to 89 THEN
  START ELSE IF
    PRINT "student got second rank"
  END ELSE IF
  ELSE IF marks are greater than or equal to 50 and marks are less than or equal to 74 THEN
  START ELSE IF
    PRINT "student got third rank"
  END ELSE IF
  ELSE IF marks are greater than or equal to 35 and marks are less than or equal to 49 THEN
  START ELSE IF
    PRINT " student passed the test"
  END ELSE IF
  ELSE
  START ELSE
    PRINT "student failed the test"
  END ELSE
END
    
