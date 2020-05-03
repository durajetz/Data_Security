#  Siguria e të Dhënave
Projekti në lëndën Siguria e të Dhënave
Faza e parë dhe e dytë, __Grupi27__.

Ky projekt u zhvillua në gjuhën programuese:
 [Java SE Development Kit 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) 
# Qëllimi
 Një console program me emrin ***ds*** i cili pranon komanda përmes argumenteve. Programi do t’i analizojë argumentet, dhe varësisht nga përmbajtja e tyre do ta ekzekutojë ndonjërën prej komandave:
 - ***Count***  - Numëron paraqitjen e njësisë <unit> në tekst<text>. 
 - ***Case*** - E konverton tekstin <text> në madhësinë e dhënë<case>.
 - ***Tap-code*** - Enkodon tekstin<text> në Tap Kodin dhe Dekodon vargun nga Tap Kodi në alfabet latin.
 - ***Create-user*** - Krijon një çift të publik/privat të RSA me emrat .xml dhe .pub.xml brenda direktoriumit të çelësave keys.
 - ***Delete-user*** - I largon të gjithë çelësat ekzistues të shfrytëzuesit.
 - ***Export-key*** - Eksporton çelësin publik ose privat të shfrytëzuesit nga direktoriumi i çelësave.
 - ***Import-key*** - Importon çelësin publik ose privat të shfrytëzuesit nga shtegu i dhënë dhe e vendos në direktoriumin e çelësave.
 - ***Write-message*** - E shkruan një mesazh të enkriptuar të dedikuar për një shfrytëzues.
 - ***Read-message*** - E dekripton dhe e shfaq në console mesazhin e enkriptuar.

# Parakushtet
 * Choosing your Java IDE(Për shkruarjen e programeve me anë të gjuhës programuese Java)
 * Choosing your Command line (Për thirrjen e argumenteve - args passing)
```
Për këtë projekt u përdorën:
 * IntelliJ IDEA 2019.1.2 
 * Git Bash
```


# Instruksionet
1. Vendosja e gjitha komandave dhe programit ***ds*** në një directory të vetëm,pra:
<img src="https://images2.imagebam.com/e8/ad/06/42c0ff1342642683.PNG" alt="" width="400px">
2. Kompajllimi me anë të
    **Java programming language compiler**
    (*javac* pronounced "**java**-see")
 në **command line**(*git bash* në këtë rast):

​       <img src="https://images2.imagebam.com/d2/68/da/e122271337326893.PNG" alt="" width="300p     x"> </br>
```Ju mund të përdorni një "wildcard" që të kompajlloni të gjitha fajllat brenda një folderi, si psh: javac *.java```

>type ***java*** before **'ds'** to run your program on cmd.

# Ekzekutimi i komandave
Ekzekutimi i komandave *count,case,tap-code,create-user,delete-user,export-key,import-key,write-message,read-message* përmes thirrjes së argumenteve të programit main ***ds*** nga command line.
## Komanda count

count | unit | text
--- | --- | ---
komanda|lines,words, letters, symbols,vowels, consonants,sentences | **Përshëndetje nga FIEK!** 

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/76/93/f9/c0f9341337430291.png" alt="sintaksa" style="width: 250px;"/></p>

**Shembull:**

```$ ds count lines "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/47/d0/50/ae6b4b1337331187.PNG" alt="" width="400px">


```$ ds count words "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/77/13/00/33824b1337331397.PNG" alt="" width="400px">

```$ ds count letters "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9a/f1/af/9f9ab01337332291.PNG" alt="" width="400px">

```$ ds count symbols "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/7d/93/e4/4773821337332618.png" alt="" width="400px">

```$ ds count vowels "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ce/3f/b8/41d0821337332764.png" alt="" width="400px"/>

```$ ds count consonants "Pershendetje nga FIEK!"```</br>
<img src="https://images2.imagebam.com/9c/03/9a/bc3a2a1337333122.PNG" alt="" width="400px">

```$ ds count sentences "Pershendetje. nga FIEK!"```</br>
<img src="https://images2.imagebam.com/ae/57/40/f7ccf41337333290.PNG" alt="" width="400px">

## Komanda case

| case    | case(funksioni)                                     | text                       |
| :------ | --------------------------------------------------- | -------------------------- |
| komanda | upper,lower,capitalize,inverse,alternating,sentence | **Përshëndetje nga FIEK!** |

<p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/d3/06/91/1d68e51337430295.png" alt="sintaksa" style="width: 250px;"/></p>

**Shembull:**

```$ ds case upper "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/27/2c/98/7800d01337426620.png" alt="" width="400px">

```$ ds case lower "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/f7/f2/1f/0960e31337426631.PNG" alt="" width="400px">

```$ ds case capitalize "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/a5/87/46/36a01d1337426616.PNG" alt="" width="400px">

```$ ds count inverse "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/92/d8/f6/1b246e1337426624.PNG" alt="" width="400px">

```$ ds count alternating "Pershendetje nga FIEK!"```</br><img src="https://images2.imagebam.com/9c/07/19/0546911337426607.PNG" alt="" width="400px">

```$ ds count sentence "pershendetje, Fjalia E pare. FJALIA E DYTE! fjAlia E trEte."```</br><img src="https://images2.imagebam.com/80/be/b3/3aa1981337426637.PNG" alt="" width="400px">


## Komanda tap-code
|plaintext| ciphertext |
|--|--|
| neser |  ... ...  . .....  .... ...  . ..... .... ..|

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/bb/83/d1/d52e831337442864.png" alt="sintaksa" style="width: 250px;"/></p>
**Shembull:**

```$ ds tap-code encode "i can fly"```</br><img src="https://images2.imagebam.com/8f/b9/06/029e391337336916.PNG" alt="" width="600px">

```$ ds tap-code decode ".. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ...."```</br><img src="https://images2.imagebam.com/7b/03/60/d12f111337336918.PNG" alt="" width="600px">

## Komanda create-user

| create-user | çelësat                 | formati |
| :---------- | ----------------------- | ------- |
| komanda     | publik(.pub) dhe privat | .xml    |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/95/db/4b/8578fb1342663372.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ds create-user test```</br><img src="https://images2.imagebam.com/c0/75/10/40657e1342645690.PNG" alt="" width="600px">

```$ ds create-user test```</br><img src="https://images2.imagebam.com/23/00/94/30c3731342645187.PNG" alt="" width="600px">

## Komanda delete-user

| delete-user | çelësat                 | formati |
| :---------- | ----------------------- | ------- |
| komanda     | publik(.pub) dhe privat | .xml    |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/be/b4/ff/2891801342663376.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ds delete-user test```</br><img src="https://images2.imagebam.com/78/7e/80/244a211342649379.PNG" alt="" width="600px">

```$ ds delete-user test```</br><img src="https://images2.imagebam.com/3c/c1/c0/ccc1811342649371.PNG" alt="" width="600px">

```$ ds delete-user test```(në rast se ekziston vetëm çelësi publik)</br><img src="https://images2.imagebam.com/4e/91/66/92997b1342649376.PNG" alt="" width="600px">

```$ ds delete-user test```(në rast se ekziston vetëm çelësi privat)</br><img src="https://images2.imagebam.com/f2/de/8d/889e831342650582.PNG" alt="" width="600px">

## Komanda export-key

| export-key | çelësi                  | export to               |
| :--------- | ----------------------- | ----------------------- |
| komanda    | publik(.pub) ose privat | cmd ose file(opsionale) |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/d9/42/1c/6cf4b71342663378.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ds export-key public test```</br><img src="https://images2.imagebam.com/0b/e0/0f/1914181342652640.PNG" alt="" width="600px">

```$ ds export-key privat test Path//celesi.xml```</br><img src="https://images2.imagebam.com/c9/ea/0c/1598061342655987.PNG" alt="" width="600px">

```$ ds export-key privat test```(në rast se nuk ekziston çelësi paraprak ne dir. keys)</br><img src="https://images2.imagebam.com/c5/a0/7a/dc9c231342652575.PNG" alt="" width="600px">

## Komanda import-key

| import-key | import from        | çelësi         |
| :--------- | ------------------ | -------------- |
| komanda    | path//filename.ext | dir. keys/name |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/42/0b/f1/cb76b01342663382.png" alt="sintaksa" style="width: 250px;"/></p>


**Shembull:**

```$ ds import-key Path//publickey.ext edon```</br><img src="https://images2.imagebam.com/9f/26/5f/fa27f31342657808.PNG" alt="" width="600px">

```$ ds import-key Path//privatekey.ext blerim```</br><img src="https://images2.imagebam.com/4d/75/e6/2fce0b1342657810.PNG" alt="" width="600px">

```$ ds import-key Path//somekey.ext edon```</br><img src="https://images2.imagebam.com/df/60/d2/1230981342657817.PNG" alt="" width="600px">

```$ ds import-key Path//somekey.ext blerim```(ne rast se wrong ext)</br><img src="https://images2.imagebam.com/fb/4c/4e/6f4fb01342657821.PNG" alt="" width="600px">

```$ ds import-key https://url publicfromrequest```</br><img src="https://images2.imagebam.com/46/4b/55/2bd7901342657826.PNG" alt="" width="600px">

## Komanda write-message

| write-message | enkriptimi        | save encrypt               |
| :------------ | ----------------- | -------------------------- |
| komanda       | me çelësin publik | ne cmd ose file(opsionale) |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://images2.imagebam.com/c6/4c/d7/1151ba1342662935.png" alt="sintaksa" style="width: 250px;"/></p>

```$ ds write-message test "This is a plaintext"```</br><img src="https://images2.imagebam.com/e6/0b/b4/36bb511342659637.PNG" alt="" width="600px">

```$ ds write-message edon "Takohemi ne route66 ora 6:00" Path//file.ext```</br><img src="https://images2.imagebam.com/44/17/a2/0d51501342659640.PNG" alt="" width="600px">

```$ ds write-message blerim "Pershendetje"```</br><img src="https://images2.imagebam.com/b7/bf/0b/9d1bc81342659643.PNG" alt="" width="600px">

## Komanda read-message

| read-message | dekriptimi        | load encrypt                |
| :----------- | ----------------- | --------------------------- |
| komanda      | me çelësin privat | nga cmd ose file(opsionale) |

 <p align="center"><b><em>Sintaksa :</em></b></br>
<p align="center"><img src="https://www.latex4technics.com/l4ttemp/6ac5hq.png?1588515735617" alt="sintaksa" style="width: 250px;"/></p>

```$ ds read-message "mesazhi i enkpritum"```</br><img src="https://images2.imagebam.com/1a/78/05/ec63961342659629.PNG" alt="" width="600px">

```$ ds read-message Path//file.ext```(File në të cilin është ruajtur mesazhi enkriptuar)</br><img src="https://images2.imagebam.com/de/d1/b1/316dbd1342659631.PNG" alt="" width="600px">

```$ ds read-message blerim ```</br><img src="https://images2.imagebam.com/f7/1d/70/af5ba31342659634.PNG" alt="" width="600px">

## Kompajllimi përmes shell script
 1. Fajllin ***ds.sh***  e vendosim në directoryn e njejtë me fajllat e tjer (ProjektiSiguri/) 
 2. Pas gjetjes së directoryt në cmd
 Kompajllojm ds scripten:
```bash
$ ./ds.sh compile

$ ./ds.sh count lines "Pershendetje nga FIEK!"
Lines: 1

$ ./ds.sh tap-code encode "this is a code"
.. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ....

$ ./ds.sh write-message test "YOU CAN NEVER DECRYPT THIS"
dGVzdA==.aVcLEP7RpVc=.GZzfhpM/jET8Nj5tjG2wkRTJbCOuAYaQJFQHvWW3Xs+SoOtBdoWQQayWBmy1v5ztd9BtI4VP5hwtR08picDRykO909NGN3AF4BZ70z56mAqk9jVfPQFHClEX+hN86CBMC6/EqkIsMN1lfjpmDrb1YcYiWqYNWjsNHEgwlyZARpA=.1miDsG4COh04XY4wXCzE+qxjzYjCCEkyFXtyjHR1TKs=
```

 ## Falënderim për

Disa nga meritorët e suksesit dhe përfundimit të kësaj faze të parë dhe të dytë të Projektit :

* [Stack Overflow](https://stackoverflow.com/)
  * [Metoda capitalize](https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string/1892778?fbclid=IwAR0yYzxmvyVgsi3uL8Of39I4NZvKEM-17GBLM4jTVW2SlqSdi71epYk22AI)
  * [XML format ](https://stackoverflow.com/questions/12512455/rsa-key-xml-format-compatible-for-net)
* [Java DOM Parser](https://www.tutorialspoint.com/java_xml/java_dom_parser.htm)
* Ass. *Edon Gashi* (i cili ka qenë në dispozicion çdo kohë për t'iu përgjigjur paqartësive tona)

# Autorët

* [Aurel Demiraj](mailto:aureldem1@outlook.com)
* [Besar Pallush](mailto:besarp5@gmail.com)
* [Durajet Mustafa](mailto:eti1375@gmail.com)

___
<small><i>Përshkrimi i projektit (<a href='https://www.dropbox.com/s/aryposlxmi1qctk/grupi-27.pdf?dl=0'> Faza1</a>,<a href='https://www.dropbox.com/s/8go31knlafn55t8/ds_projekti_2.pdf?dl=0'>Faza2</a>)</i>,</br>
Regards Grupi27 (Sferat e Dragoit).</small>






