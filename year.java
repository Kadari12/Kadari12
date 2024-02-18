BEGIN
  SET month name to april
  SWITCH(month name)THEN
  START SWITCH
     CASE march:
     CASE april:
     CASE may:
     CASE june:
        PRINT "given month is summer season"
        BREAK
     CASE july:
     CASE august:
     CASE september:
     CASE october"
        PRINT "given month is rainy season"
        BREAK
     CASE november:
     CASE december:
     CASE january:
     CASE february
        PRINT "given month is winter"
        BREAK
    DEFAULT:
         PRINT "IN A YEAR HAS 12 MONTHS"
    END SWITCH
END
    
