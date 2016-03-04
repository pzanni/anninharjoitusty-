#Käyttöohjeet

##Menojen merkitseminen
Kirjoita 1 ja paina enter. Tämän jälkeen ohjelma kysyy kategoriaa. Anna haluttu menon 
kategoria ja paina enter. Syötä vielä kategoriaan liittyvä arvo ja paina
uudestaan enter. Jos sama kategoria on aiemmin listattu ohjelmalle, niin 
ohjelma uuden kategorian luomisen sijaan korottaa aiemman arvoa käyttäjän
antaman syötteen mukaisesti.

##Tulojen merkisteminen
Kirjoita 2 ja paina enter. Nyt ohjelma antaa vaihtoehtoja erilaisista tuloista.
Etene haluamasi tavan mukaan:
####Opintotuen merkitseminen
Kirjoita 1 ja paina enter. Jos opintotukea merkataan ensimmäisen kerran, ohjelma
kysyy opintotuen määrää. Syötä nyt haluttu opintotuen määrä ja paina enter. 
Nyt ohjelma muistaa opintotuen ja merkitsee sen automaattisesti eikä kysy 
jatkossa sen arvoa. Opintotuen arvoa voi toki itse vaihtaa (ks. kohta: 
Opintotuen hallinta).
####Opintolainan merkitseminen
Kirjoita 2 ja paina enter. Ohjelma on nyt merkinnyt yhden kuukauden opintolainan 
noston ylös. Ohjelma laittaa oletuksena lainan arvoksi 400.0, mutta tätä 
käyttäjä voi itse muuttaa(ks. kohta: Opintolainan hallinta).
####Palkan merkitseminen
Kirjoita 3 ja paina enter. Ohjelma kysyy nyt palkan arvoa. Syötä haluttu arvo
ja paina enter. Nyt ohjelma on kirjannut ylös palkan. Tutustu myös tulorajan 
asettamiseen kohdassa Palkan hallinta.
####Muun tulon merkitseminen
Muut aiempiin kategorioihin sopimattomat tulot ohjelma merkkaa ylös 
kategorioittain. Kirjoita nyt 4 ja paina enter. Ohjelma kysyy kategorian nimeä.
Syötä haluttu kategoria ja paina enter. Tämän jälkeen ohjelma kysyy arvoa. Syötä haluttu kategoriaan liittyvä arvo ja paina enter. Jos haluat lisätä jo olemassa olevaan
kategoriaan syötä kategorian nimi normaalisti ja ohjelma lisää arvon kategorian
nimen perusteella vanhaan arvoon.

##Menojen yhteenvedon tarkastelu
Kirjoita 3 ja paina enter. Ohjelma tekee yhteenvedon kaikista kategorioista ja 
niiden arvoista. Joka rivillä siis on: *Kategorian_nimi* *arvo_yhteensä*

##Tulojen yhteenvedon tarkastelu
Kirjoita 4 ja paina enter. Ohjelma näyttää kaikki merkityt tulot seuraavasti:
Opintotuki: *opintotuen_yhteissumma* *käytetyt_tukikuukaudet*
Opintolaina: Yhteensä *nostetun_opintolainan_yhteissumma*
Palkka: Yhteensä *merkattu_palkka_yhteensä* (/*annettu_tuloraja*)
*muun_tulon_kategorianimi* *kategorian_yhteissumma*
Yhteensä: *kaikki_merkatut_tulot_yhteensä*

##Hallinnointi
Kirjoita 5 ja paina enter. Ohjelma näyttää listan eri vaihtoehdoista. Etene
 haluamasi mukaan:
####Opintotuen hallinnointi
Kirjoita 1 ja paina enter. Jos haluat muuttaa opintotuen määrää kirjoita 1 ja 
paina enter. Nyt ohjelma kysyy uutta opintotukea. Syötä haluttu opintotukimäärä
ja paina enter. Nyt ohjelma merkitsee tuet uuden arvon mukaan. Jos taas haluat 
nollata merkittyjen arvojen summan, kirjoita 2 ja paina enter. Jos haluat nollata
merkityt tukikuukaudet kirjoita 3 ja paina enter.
####Opintolainan hallinnointi
Kirjoita 2 ja paina enter. Jos haluat muuttaa opintolainan kuukausittaisen noston
määrää, kirjoita 1 ja paina enter. Ohjelma kysyy tämän jälkeen uuden lainan
arvoa. Kirjoita kuukausittainen opintolaina ja paina enter. Jos taas haluat 
vähentää nostetun opintolainan arvoa, kirjoita 2 ja paina enter. Nyt kirjoita 
kuinka paljon haluat että opintolainan yhteissummaa vähennetään ja paina enter.
####Palkan hallinnointi
Kirjoita 3 ja paina enter. Jos haluat muuttaa tulorajaa, kirjoita 1 ja paina enter. Ohjelma kysyy uutta tulorajaa. Syötä haluttu tuloraja ja paina 
enter. Nyt kun merkittyjen palkkojen yhteissumma on suurempi tai yhtäsuuri kuin asetettu tuloraja, ohjelma ilmoittaa siitä. Ohjelma kuitenkin merkitsee
tulot yhteissummaan tulorajan täyttymisestä huolimatta. Jos haluat nollata merkatun
palkan yhteissumman, kirjoita 2 ja paina enter. Jos haluat poistaa tulorajan
 käytöstä kirjoita 3 ja paina enter.
####Muiden tulojen hallinnointi
Kirjoita 4 ja paina enter. Jos haluat poistaa yksittäisen kategorian, kirjoita 1 ja paina enter. Ohjelma kysyy tämän jälkeen poistettavan kategorian nimeä. Kirjoita kategorian nimi ja paina enter. Jos haluat nollata jonkun kategorian arvon, kirjoita 2 ja paina enter. Kirjoita tämän jälkeen nollattava kategorian nimi ja paina enter. Jos taas haluat poistaa kaikki kategoriat, kirjoita 3 ja paina enter.
