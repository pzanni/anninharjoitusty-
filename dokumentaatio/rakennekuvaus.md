#Rakennekuvaus
Rahalaskuri-luokka on ohjelman käynnistäjä. Siitä lähtevät pääkomennot ja se 
on yhteydessä luokkiin LisaaTulo, Hallinnoi ja LisaaMeno. LisaaTulo on vastuussa
tuloihin liittyvistä komennoista, joten se on yhteydessä Tulot-luokkaan sekä 
Kysyja-luokkaan joka sisältää Scanner(System.in) olion. LisaaMeno-luokka on 
vastuussa menoihin liityvistä komennoista, joten se on yhteydessä Menot-luokkaan
ja myös Kysyja-luokkaan. Hallinnoi-luokka vastaa menojen ja tulojen hallinnointiin
liittyvistä komennoista, joten se on yhteydessä sekä LisaaTulo-luokkaan että 
LisaaMeno-luokkaan. Ja myös tietenkin Kysyja-luokkaan.

Tulot-luokka on vastuussa kaikista tuloihin liittyvistä luokista, joten se on 
yhteydessä luokkiin Palkka, Opintolaina, Opintotuki ja MuuTulo. Menot luokka on 
vastaava luokka menoille eli se on yhteydessä luokkaan Meno. Menot-luokka pitää
sisällään kaikki Menot-oliot HashMapissä.
