SELECT vastausid, vastaus.teksti, vastaus.vaihtoehtoid, vastaus.kysymysid, vastaus.vastaajaid, vaihtoehto.teksti FROM vastaus INNER JOIN vaihtoehto ON vastaus.vaihtoehtoid=vaihtoehto.vaihtoehtoid ORDER BY vastausid;