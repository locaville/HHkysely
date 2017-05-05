<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HH-kyselyn REST API</title>
</head>
<body>

<h3>HH-kyselyn REST API</h3>

<p>Kyselyn kysymysten haku:<br>
proto333.haaga-helia.fi:8080/mvc/kyselyt/{kyselyid}/kysymykset/<br>
metodi: GET<br>
parametrit: -<br>
esimerkkikutsut:<br>
http://proto333.haaga-helia.fi:8080/mvc/kyselyt/1/kysymykset/<br>
http://proto333.haaga-helia.fi:8080/mvc/kyselyt/2/kysymykset/<br>
</p>
<p>
API response:<br>
{<br>
“id”: 1, “teksti”: “HHkysely”, “tyyppi”: “koulukysely”, “tila”: “avoin”, “kysymykset”:<br>
 [<br>
{”id”: 3, ”teksti”: ”Anna vapaata palautetta:”, ”tyyppiid”: 3, ”vaihtoehdot”: null},<br>
<br>
 {”id” :1, ”teksti”: ”Mikä on hyvä?”, ”tyyppiid”: 2, ”vaihtoehdot”: [<br>
{”id”:1, ”teksti”: ”Kyllä”},<br>
{”id”:2, ”teksti”: ”Ei”}]<br>
},<br>
{”id”: 2, ”teksti”: ”Milloin koulussa on kivaa?”, ”tyyppiid”: 1, ”vaihtoehdot”: [<br>
{”id”:3, ”teksti”: ”Kun on mielekästä tekemistä”},<br>
{”id”:4, ”teksti”: ”Kun ei ole stressiä”},<br>
{”id”: 5, ”teksti”: ”Kun ruokalassa on hyvää ruokaa”}]<br>
}<br>
]<br>
}<br>
<br><br><br>



Yhden kysymyksen vastauksen lähettäminen:<br><br>

proto333.haaga-helia.fi:8080/mvc/kyselyt/{kyselyid}/vastaukset<br>
metodi: POST<br>
parametrit: -<br>
esimerkkikutsut:<br>
proto333.haaga-helia.fi:8080/mvc/kyselyt/1/vastaukset<br>
<br>
API request body:<br>
{“id”: 435, “vastaukset”: [<br>
{“id”: 0, “kysymysid”: 2, ”teksti”: null, “vaihtoehdot”: [<br>
{“id”: 5, “teksti”: “Kun ei ole stressiä”},<br>
{”id”: 6, ”teksti”: ”Kun ruoka on hyvää”}]},<br>
	{”id”: 0, ”kysymysid”: 3, ”teksti”: ”kyllä”, ”vaihtoehdot”: null},<br>
	{”id”: 0, ”kysymysid”: 4 ”teksti”: null, ”vaihtoehdot”: [<br>
{”id”: 6, ”teksti”: ”Aina”},<br>
{”id”: 7, ”teksti”: ”Joskus”},<br>
{”id”: 8, ”teksti”: ”Ei koskaan”}]}<br>
<br>
]}<br>
</p>



</body>
</html>