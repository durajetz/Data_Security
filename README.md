#  Siguria e të Dhënave
Projekti në lëndën Siguria e të Dhënave
Faza e parë, __Grupi27__.

Ky projekt u zhvillua në gjuhën programuese:
 [Java SE Development Kit 8]((https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) )
# Qëllimi
 Një console program me emrin ***ds*** i cili pranon komanda përmes argumenteve. Programi do t’i analizojë argumentet, dhe varësisht nga përmbajtja e tyre do ta ekzekutojë ndonjërën prej komandave:
 - ***Count***  - Numëron paraqitjen e njësisë <unit> në tekst<text>. 
 - ***Case*** - E konverton tekstin <text> në madhësinë e dhënë<case>.
 - ***Tap code*** - Enkodon tekstin<text> në Tap Kodin dhe Dekodon vargun nga Tap Kodi në alfabet latin.

# Parakushtet
 * Choosing your Java IDE(Për shkruarjen e programeve me anë të gjuhës programuese Java)
 * Choosing your Command line (Për thirrjen e argumenteve - args passing)
```
Për këtë projekt u përdorën:
 * IntelliJ IDEA 2019.1.2 
 * Git Bash
```


# Instruksionet
1. Vendosja e tri komandave(***count,case,tap-code**)* dhe programit ***ds*** në një directory të vetëm,pra:
![Directory në këtë rast: ProjektiSiguri/](https://images2.imagebam.com/e6/2a/ac/1a09b71337326461.PNG)
2. Kompajllimi me anë të:
  **Java programming language compiler**
  (*javac* pronounced "**java**-see")
 në **command line**(*git bash* në këtë rast):
 
![javac](https://images2.imagebam.com/d2/68/da/e122271337326893.PNG)

```Ju mund të përdorni një "wildcard" që të kompajlloni të gjitha fajllat brenda një folderi, si psh: javac *.java```

# Ekzekutimi i komandave
Ekzekutimi i komandave *count,case,tap-code* përmes thirrjes së argumenteve të programit main ***ds*** nga command line.
## Komanda count

count | unit | text
--- | --- | ---
|komanda |lines,words, letters, symbols,vowels, consonants,sentences|**Përshëndetje nga FIEK!**

*Sintaksa*:

![sintaksa](https://latex.codecogs.com/png.latex?%5Clarge%20%5Cunderbrace%7B%5Ctexttt%7Bds%7D%7D_%7Bmain%7D%5Cunderbrace%7B%5Ctexttt%7Bcount%7D%7D_%7Bargs%5B0%5D%5Chspace%7B0em%7D%7D%20%5Cunderbrace%7B%5Ctexttt%7B%3Cunit%3E%7D%7D_%7Bargs%5B1%5D%5Chspace%7B0em%7D%7D%20%5Cunderbrace%7B%5Ctexttt%7B%3Ctext%3E%7D%7D_%7Bargs%5B2%5D%5Chspace%7B0em%7D%7D)

**Shembull:**

>type ***java*** before **'ds'** to run your program on cmd.

```$ ds count lines "Pershendetje nga FIEK!"```
![lines](https://images2.imagebam.com/47/d0/50/ae6b4b1337331187.PNG)


```$ ds count words "Pershendetje nga FIEK!"```
![words](https://images2.imagebam.com/77/13/00/33824b1337331397.PNG)

```$ ds count letters "Pershendetje nga FIEK!"```
![](https://images2.imagebam.com/9a/f1/af/9f9ab01337332291.PNG)

```$ ds count symbols "Pershendetje nga FIEK!"```
![](https://images2.imagebam.com/7d/93/e4/4773821337332618.png)

```$ ds count vowels "Pershendetje nga FIEK!"```
![](https://images2.imagebam.com/ce/3f/b8/41d0821337332764.png)

```$ ds count consonants "Pershendetje nga FIEK!"```
![](https://images2.imagebam.com/9c/03/9a/bc3a2a1337333122.PNG)

```$ ds count sentences "Pershendetje. nga FIEK!"```
![enter image description here](https://images2.imagebam.com/ae/57/40/f7ccf41337333290.PNG)

## Komanda case
..
## Komanda tap-code
***Tap-Code*** enkodon dhe dekodon `<tekstin>` sipas tabelës: 

![enter image description here](https://images2.imagebam.com/ce/82/3c/5563ab1337335448.png)

> eg.

|plaintext| ciphertext |
|--|--|
| neser |  ... ...  . .....  .... ...  . ..... .... ..|
```Shkronja 'N' -> ... ...``` Rreshti 3 - Shtylla 3

 - Shkronjat ndërmjet vete ndahen me nga dy space
 - Ndërsa fjalet ndahen me : "  /  "
 - Lexo më shumë për [Tap-Code](https://www.braingle.com/brainteasers/codes/tapcode.php).

*Sintaksa*:

![enter image description here](https://images2.imagebam.com/85/b8/05/d625281337337747.png)

**Shembull:**

>type ***java*** before **'ds'** to run your program on cmd.

```$ ds tap-code encode "i can fly"```
![enter image description here](https://images2.imagebam.com/8f/b9/06/029e391337336916.PNG)

```$ ds tap-code encode ".. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ...."```
![enter image description here](https://images2.imagebam.com/7b/03/60/d12f111337336918.PNG)



























## Kompajllimi përmes shell script
Argumentet ose variablat mund të kalohen në një skenar shell (*shell script*). Thjesht renditni argumentet në vijën e komandës kur ekzekutoni një shell script. Në skriptet shell, 0 $ është emri i komandës së ekzekutuar (zakonisht emri i skedarit të skriptit të guaskës); 1 $ është argumenti i parë, 2 $ është argumenti i dytë, 3 $ është argumenti i tretë,etj.

 1. Fajllin ***ds.sh***  e vendosim në directoryn e njejtë me fajllat e tjer (ProjektiSiguri/) 
 2. Pas gjetjes së directoryt në cmd
 Kompajllojm ds scripten:
```bash
$ ./ds.sh compile

$ ./ds.sh count lines "Pershendetje nga FIEK!"
Lines: 1

$ ./ds.sh tap-code encode "this is a code"
.. ....  /  . ...  . .  ... ...  /  .. .  ... .  ..... ....


```

 

<!--stackedit_data:
eyJoaXN0b3J5IjpbODYzMTUzNzg3XX0=
-->
