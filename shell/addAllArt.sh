#!/bin/bash

# Template
# curl http://localhost:8080/art/add -d title=x -d medium=x -d imgFull=x -d imgComp=x -d type=x -d category=x -d height=x -d width=x -d feature=x

# Test Image
# curl http://localhost:8080/art/add -d "title=Test Image" -d medium=screenshot -d imgFull=testImgFull.png -d imgComp=testImgComp.png -d "type=print screen" -d category=digital -d height=750 -d width=631 -d feature=True

# Sensation
curl http://localhost:8080/art/add -d title=Sensation -d "medium=Watercolor and Gauche" -d imgFull=sensationFull.jpg -d imgComp=sensationFull.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=true

# Arm Anatomy
curl http://localhost:8080/art/add -d "title=Arm Anatomy" -d medium=Pen -d imgFull=armAnatomyFull.png -d imgComp=armAnatomyFull.png -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Tortuous
curl http://localhost:8080/art/add -d title=tortuous -d medium=Ceramic -d imgFull=tortuousFull.jpg -d imgComp=tortuousFull.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# SG Logo
curl http://localhost:8080/art/add -d "title=SG Logo v2" -d medium=SVG -d imgFull=SGlogoV2.svg -d imgComp=SGlogoV2.svg -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# Two Broken Fingers
curl http://localhost:8080/art/add -d "title=Two Broken Fingers" -d "medium=Oil Paint and Photoshop" -d imgFull=twoBrokenFingersFull.png -d imgComp=twoBrokenFingersFull.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# ================= EXTRA TEST ITEMS =================

# Test Image 1 [paint]
curl http://localhost:8080/art/add -d "title=Test Image 1" -d medium=testPaint -d imgFull=testImgFull.png -d imgComp=testImgFull.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Test Image 2 [draw]
curl http://localhost:8080/art/add -d "title=Test Image 2" -d medium=testDraw -d imgFull=testImgFull.png -d imgComp=testImgFull.png -d type=trad -d category=draw -d height=0 -d width=0 -d feature=true

# Test Image 3 [other]
curl http://localhost:8080/art/add -d "title=Test Image 3" -d medium=testOther -d imgFull=testImgFull.png -d imgComp=testImgFull.png -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Test Image 4 [logo]
curl http://localhost:8080/art/add -d "title=Test Image 4" -d medium=testLogo -d imgFull=testImgFull.png -d imgComp=testImgFull.png -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# Test Image 5 [cover]
curl http://localhost:8080/art/add -d "title=Test Image 5" -d medium=testCover -d imgFull=testImgFull.png -d imgComp=testImgFull.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=true
