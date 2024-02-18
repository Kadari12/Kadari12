BEGIN
  SET alpha to a
  SWITCH(alpha)THEN
  START SWITCH
     CASE A:
     CASE a:
     CASE B:
     CASE b:
     CASE C:
     CASE c:
     CASE D:
     CASE d:
     CASE E:
     CASE e:
         PRINT alpha+"is vowel"
         BREAK
    DEFAULT:
         PRINT alpha+"is consonant"
    END SWITCH
END
