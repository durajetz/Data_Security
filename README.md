#  Siguria e të Dhënave
Projekti në lëndën Siguria e të Dhënave (Data Security), __Grupi27__.

Ky projekt u zhvillua në gjuhën programuese:
[Java SE Development Kit 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) 

# Qëllimi
 Një console program me emrin ***ds*** i cili pranon komanda përmes argumenteve. Programi do t’i analizojë argumentet, dhe varësisht nga përmbajtja e tyre do ta ekzekutojë ndonjërën prej komandave:
 - ***Count***  - Numëron paraqitjen e njësisë <unit> në tekst<text>. 
 - ***Case*** - E konverton tekstin <text> në madhësinë e dhënë<case>.
 - ***Tap-code*** - Enkodon tekstin<text> në Tap Kodin dhe Dekodon vargun nga Tap Kodi në alfabet latin.
 - ***Create-user*** - Krijon një çift të publik/privat të RSA me emrat .xml dhe .pub.xml brenda direktoriumit të çelësave keys si dhe një user që ruhet automatikisht në fajllin: Desktop/databasa.txt.
 - ***Delete-user*** - I largon të gjithë çelësat ekzistues të shfrytëzuesit dhe largon userin nga databasa.
 - ***Login*** - Mundson kyçjen e userit me anë të passwordit që është ruajtur si salt në databas dhe krijimin e një JWT tokeni ku si Subject të body-t pranon userin.
 - ***Status*** - Tregon gjendjen e validimit të JWT tokenit.
 - ***Export-key*** - Eksporton çelësin publik ose privat të shfrytëzuesit nga direktoriumi i çelësave.
 - ***Import-key*** - Importon çelësin publik ose privat të shfrytëzuesit nga shtegu i dhënë dhe e vendos në direktoriumin e çelësave.
 - ***Write-message*** - E shkruan një mesazh të enkriptuar të dedikuar për një shfrytëzues.
 - ***Read-message*** - E dekripton dhe e shfaq në console mesazhin e enkriptuar.

# Parakushtet
 * Install the JDK Software and Set JAVA_HOME on a Windows System
 * Choosing your Java IDE(Për shkruarjen e programeve me anë të gjuhës programuese Java)
 * Choosing your Command line (Për thirrjen e argumenteve - args passing)
```
Për këtë projekt u përdorën:
 * IntelliJ IDEA 2019.1.2 
 * Git Bash
```


# Instruksionet
```bash
$ git clone https://github.com/aureldemiraj/ds-gr27-2020.git
$ cd ds-gr27-2020/Projekti_Siguri
$ ./ds.sh <komanda> <argumentet>
```

```bash
test@user MINGW64 ~/.../ds-gr27-2020/Projekti_Siguri
$ ./ds.sh create-user test
```

> Skripta ./ds.sh.sh përmban kodin për ekzekutimin e ./ds.sh.jar (jar file qe e ka një main class me anë të së cilës mundet me u exec programi).



# Ekzekutimi i komandave

## Komanda count

count | unit | text
--- | --- | ---
komanda|lines,words, letters, symbols,vowels, consonants,sentences | **Përshëndetje nga FIEK!** 

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/76/93/f9/c0f9341337430291.png" alt="sintaksa" style="width: 250px;"/></p>
**Shembull:**

```$ ./ds.sh count lines "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/47/d0/50/ae6b4b1337331187.PNG" alt="" width="400px">

```$ ./ds.sh count words "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/77/13/00/33824b1337331397.PNG" alt="" width="400px">

```$ ./ds.sh count letters "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9a/f1/af/9f9ab01337332291.PNG" alt="" width="400px">

```$ ./ds.sh count symbols "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/7d/93/e4/4773821337332618.png" alt="" width="400px">

```$ ./ds.sh count vowels "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ce/3f/b8/41d0821337332764.png" alt="" width="400px"/>

```$ ./ds.sh count consonants "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9c/03/9a/bc3a2a1337333122.PNG" alt="" width="400px">

```$ ./ds.sh count sentences "Pershendetje. nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ae/57/40/f7ccf41337333290.PNG" alt="" width="400px">

## Komanda case

| case    | case(funksioni)                                     | text                       |
| :------ | --------------------------------------------------- | -------------------------- |
| komanda | upper,lower,capitalize,inverse,alternating,sentence | **Përshëndetje nga FIEK!** |

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/d3/06/91/1d68e51337430295.png" alt="sintaksa" style="width: 250px;"/></p>

**Shembull:**

$ ./ds.sh case upper "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/27/2c/98/7800d01337426620.png" alt="" width="400px">

```$ ./ds.sh case lower "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/f7/f2/1f/0960e31337426631.PNG" alt="" width="400px">

```$ ./ds.sh case capitalize "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/a5/87/46/36a01d1337426616.PNG" alt="" width="400px">

```$ ./ds.sh count inverse "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/92/d8/f6/1b246e1337426624.PNG" alt="" width="400px">

```$ ./ds.sh count alternating "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/9c/07/19/0546911337426607.PNG" alt="" width="400px">

```$ ./ds.sh count sentence "pershendetje, Fjalia E pare. FJALIA E DYTE! fjAlia E trEte."```</br><img src="https://images2.imagebam.com/80/be/b3/3aa1981337426637.PNG" alt="" width="400px">


## Komanda tap-code
|plaintext| ciphertext |
|--|--|
| neser |  ... ...  . .....  .... ...  . ..... .... ..|

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/bb/83/d1/d52e831337442864.png" alt="sintaksa" style="width: 250px;"/></p>



**Shembull:**

```$ ./ds.sh tap-code encode "i can fly"```</br><img src="https://images2.imagebam.com/8f/b9/06/029e391337336916.PNG" alt="" width="600px">

```$ ./ds.sh tap-code decode ".. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ...."```</br><img src="https://images2.imagebam.com/7b/03/60/d12f111337336918.PNG" alt="" width="600px">

## Komanda create-user

| create-user |         çelësat         | formati | ruan userin  |
| :---------: | :---------------------: | :-----: | :----------: |
|   komanda   | publik(.pub) dhe privat |  .xml   | database.txt |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/95/db/4b/8578fb1342663372.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ./ds.sh create-user test```</br><img src="https://images2.imagebam.com/e5/77/80/0305121345775716.PNG" alt="" width="600px">

```$ ./ds.sh create-user test```</br><img src="https://images2.imagebam.com/23/00/94/30c3731342645187.PNG" alt="" width="600px">

```$ ./ds.sh create-user test```</br><img src="https://images2.imagebam.com/9d/13/4f/2b83aa1345775717.PNG" alt="" width="600px">

## Komanda delete-user

| delete-user |         çelësat         | formati | fshin userin |
| :---------: | :---------------------: | :-----: | :----------: |
|   komanda   | publik(.pub) dhe privat |  .xml   | database.txt |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/be/b4/ff/2891801342663376.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ./ds.sh delete-user test```</br><img src="https://images2.imagebam.com/78/7e/80/244a211342649379.PNG" alt="" width="600px">

```$ ./ds.sh delete-user test```</br><img src="https://images2.imagebam.com/3c/c1/c0/ccc1811342649371.PNG" alt="" width="600px">

```$ ./ds.sh delete-user test```(në rast se ekziston vetëm çelësi publik)</br><img src="https://images2.imagebam.com/4e/91/66/92997b1342649376.PNG" alt="" width="600px">

```$ ./ds.sh delete-user test```(në rast se ekziston vetëm çelësi privat)</br><img src="https://images2.imagebam.com/f2/de/8d/889e831342650582.PNG" alt="" width="600px">

## Komanda login

|  login  |                user                | lëshohet tokeni |
| :-----: | :--------------------------------: | :-------------: |
| komanda | logon userin nga baza e të dhënave |   JWT format    |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://latex.codecogs.com/png.latex?%5Chuge%20%5Cunderbrace%7B%5Ctexttt%7Bds%7D%7D_%7Bargs%5B0%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7Blogin%7D%7D_%7Bargs%5B1%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%3Cuser%3E%7D%7D_%7Bargs%5B2%5D%7D" alt="sintaksa" style="width: 250px;"/></p>



**Shembull:**

```$ ./ds.sh login test```</br><img src="https://images2.imagebam.com/3d/32/fb/3a27711345776180.PNG" alt="" width="600px">

```$ ./ds.sh login test```</br><img src="https://images2.imagebam.com/96/9b/3e/9e50881345776184.PNG" alt="" width="600px">

```$ ./ds.sh login test```</br>

<img src="https://images2.imagebam.com/29/c5/63/5b54441345776182.PNG" alt="" width="600px">



## Komanda status

| status  |                            token                             |
| :-----: | :----------------------------------------------------------: |
| komanda | Nëse tokeni ka skaduar, nuk ka nënshkrim valid, ose nuk ekziston shfrytëzuesi, atëherë tokeni nuk konsiderohet valid. |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://latex.codecogs.com/png.latex?%5Chuge%20%5Cunderbrace%7B%5Ctexttt%7Bds%7D%7D_%7Bargs%5B0%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7Bstatus%7D%7D_%7Bargs%5B1%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%3Ctoken%3E%7D%7D_%7Bargs%5B2%5D%7D" alt="sintaksa" style="width: 250px;"/></p>



**Shembull:**

```$ ./ds.sh status <tokeni>```</br><img src="https://images2.imagebam.com/ef/a2/9a/7c2ef61345776187.PNG" alt="" width="600px">

## Komanda export-key

| export-key | çelësi                  | export to               |
| :--------- | ----------------------- | ----------------------- |
| komanda    | publik(.pub) ose privat | cmd ose file(opsionale) |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/d9/42/1c/6cf4b71342663378.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ./ds.sh export-key public test```</br><img src="https://images2.imagebam.com/0b/e0/0f/1914181342652640.PNG" alt="" width="600px">

```$ ./ds.sh export-key privat test Path//celesi.xml```</br><img src="https://images2.imagebam.com/c9/ea/0c/1598061342655987.PNG" alt="" width="600px">

```$ ./ds.sh export-key privat test```(në rast se nuk ekziston çelësi paraprak ne dir. keys)</br><img src="https://images2.imagebam.com/c5/a0/7a/dc9c231342652575.PNG" alt="" width="600px">

## Komanda import-key

| import-key | import from        | çelësi         |
| :--------- | ------------------ | -------------- |
| komanda    | path//filename.ext | dir. keys/name |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/42/0b/f1/cb76b01342663382.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ./ds.sh import-key Path//publickey.ext edon```</br><img src="https://images2.imagebam.com/9f/26/5f/fa27f31342657808.PNG" alt="" width="600px">

```$ ./ds.sh import-key Path//privatekey.ext blerim```</br><img src="https://images2.imagebam.com/4d/75/e6/2fce0b1342657810.PNG" alt="" width="600px">

```$ ./ds.sh import-key Path//somekey.ext edon```</br><img src="https://images2.imagebam.com/df/60/d2/1230981342657817.PNG" alt="" width="600px">

```$ ./ds.sh import-key Path//somekey.ext blerim```(ne rast se wrong ext)</br><img src="https://images2.imagebam.com/fb/4c/4e/6f4fb01342657821.PNG" alt="" width="600px">

```$ ./ds.sh import-key https://url publicfromrequest```</br><img src="https://images2.imagebam.com/46/4b/55/2bd7901342657826.PNG" alt="" width="600px">

## Komanda write-message

| write-message | enkriptimi        | save encrypt               | tokeni                                           |
| :------------ | ----------------- | -------------------------- | ------------------------------------------------ |
| komanda       | me çelësin publik | ne cmd ose file(opsionale) | deshton komanda <br/>nese tokeni nuk eshte valid |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://latex.codecogs.com/png.latex?%5Chuge%20%5Cunderbrace%7B%5Ctexttt%7Bds%7D%7D_%7Bargs%5B0%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7Bwrite-message%7D%7D_%7Bargs%5B1%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%3Cuser%3E%7D%7D_%7Bargs%5B2%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%3Cmessage%3E%7D%7D_%7Bargs%5B3%5D%7D%20%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%5Bfile%5D%7D%7D_%7Bargs%5B4%5D%7D%20%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%5B--sender%20%3Ctoken%3E%5D%7D%7D_%7Bargs%5B5%5D%7D" alt="sintaksa" style="width: 250px;"/></p>

```$ ./ds.sh write-message test "This is a plaintext"```</br><img src="https://images2.imagebam.com/e6/0b/b4/36bb511342659637.PNG" alt="" width="600px">

```$ ./ds.sh write-message edon "Takohemi ne route66 ora 6:00" Path/file.ext```</br><img src="https://images2.imagebam.com/44/17/a2/0d51501342659640.PNG" alt="" width="600px">

```$ ./ds.sh write-message blerim "Pershendetje"```</br><img src="https://images2.imagebam.com/b7/bf/0b/9d1bc81342659643.PNG" alt="" width="600px">

```$ ./ds.sh write-message edon "Takohemi ne route66 ora 6:00" Path/file.ext```</br><img src="https://images2.imagebam.com/44/17/a2/0d51501342659640.PNG" alt="" width="600px">

```$ ./ds.sh write-message fiek "tekst" Path/file.ext --sender <tokeni>```</br><img src="https://images2.imagebam.com/a1/bb/aa/f0eaa81345776899.PNG" alt="" width="600px">

## Komanda read-message

| read-message | dekriptimi        | load encrypt                |
| :----------- | ----------------- | --------------------------- |
| komanda      | me çelësin privat | nga cmd ose file(opsionale) |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://latex.codecogs.com/png.latex?%5Chuge%20%5Cunderbrace%7B%5Ctexttt%7Bds%7D%7D_%7Bargs%5B0%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7Bread-message%7D%7D_%7Bargs%5B1%5D%7D%5Chspace%7B0.5em%7D%5Cunderbrace%7B%5Ctexttt%7B%3Cencryptedmsg%7Cpath%3E%7D%7D_%7Bargs%5B2%5D%7D" alt="sintaksa" style="width: 250px;"/></p>

```$ ./ds.sh read-message "mesazhi i enkpritum"```</br><img src="https://images2.imagebam.com/1a/78/05/ec63961342659629.PNG" alt="" width="600px">

```$ ./ds.sh read-message Path//file.ext```(File në të cilin është ruajtur mesazhi enkriptuar)</br><img src="https://images2.imagebam.com/de/d1/b1/316dbd1342659631.PNG" alt="" width="600px">

```$ ./ds.sh read-message blerim ```</br><img src="https://images2.imagebam.com/f7/1d/70/af5ba31342659634.PNG" alt="" width="600px">

```$ ./ds.sh read-message <mesazhin e nenshkruar>```</br><img src="https://images2.imagebam.com/56/4f/7c/3e431c1345777246.PNG" alt="" width="600px">

```$ ./ds.sh read-message <mesazhin e nenshkruar>```</br><img src="https://images2.imagebam.com/0c/61/1d/ff0d751345777253.PNG" alt="" width="600px">

 ## References

* [Stack Overflow](https://stackoverflow.com/)
  * [Metoda capitalize](https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string/1892778?fbclid=IwAR0yYzxmvyVgsi3uL8Of39I4NZvKEM-17GBLM4jTVW2SlqSdi71epYk22AI)
  * [XML format ](https://stackoverflow.com/questions/12512455/rsa-key-xml-format-compatible-for-net)
  * [Password Hashing](https://stackoverflow.com/questions/2860943/how-can-i-hash-a-password-in-java)
  * [Pasword REGEX](https://stackoverflow.com/questions/33890681/regex-optional-special-characters) 
* [Java DOM Parser](https://www.tutorialspoint.com/java_xml/java_dom_parser.htm)
* [Java JWT: JSON Web Token for Java](https://github.com/jwtk/jjwt) 
* [Maven Package manager](https://www.tutorialspoint.com/maven/maven_external_dependencies.htm)

# Authors

* [Aurel Demiraj](mailto:aureldem1@outlook.com)
* [Besar Pallush](mailto:besarp5@gmail.com)
* [Durajet Mustafa](mailto:eti1375@gmail.com)

___
<small><i>Përshkrimi i projektit (<a href='https://www.dropbox.com/s/aryposlxmi1qctk/grupi-27.pdf?dl=0'>Faza1</a>,<a href='https://www.dropbox.com/s/8go31knlafn55t8/ds_projekti_2.pdf?dl=0'>Faza2</a>,<a href='https://www.dropbox.com/s/vstgk48exodcotg/ds_projekti_3.pdf?dl=0'>Faza3</a>)</i> </br>Regards Grupi27 (Sferat e Dragoit).</small>






