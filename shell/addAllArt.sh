#!/bin/bash

# Template
# curl http://localhost:8080/art/add -d title=x -d medium=x -d imgFull=x -d imgComp=x -d type=x -d category=x -d height=0 -d width=0 -d feature=false

# Test Image
# curl http://localhost:8080/art/add -d "title=Test Image" -d medium=screenshot -d imgFull=testImg.png -d imgComp=testImgComp.png -d "type=print screen" -d category=digital -d height=750 -d width=631 -d feature=True


# --=== LOGOS ===--

# SG Logo v2
curl http://localhost:8080/art/add -d "title=SG Logo v2" -d medium=SVG -d imgFull=SGlogoV2.svg -d imgComp=SGlogoV2.svg -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# SG Logo v1
curl http://localhost:8080/art/add -d "title=SG Logo v1" -d medium=SVG -d imgFull=SGlogoV1.svg -d imgComp=SGlogoV1.svg -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# CatalyXt Logo
curl http://localhost:8080/art/add -d "title=CatalyXt Logo" -d medium=SVG -d imgFull=catalyXtLogo.png -d imgComp=catalyXtLogo.png -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# Kandinsky.Crypto Logo
curl http://localhost:8080/art/add -d "title=Kandinsky.Crypto Logo" -d medium=SVG -d imgFull=kandinskyCryptoLogo.png -d imgComp=kandinskyCryptoLogo.png -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# Kandinsky.Crypto PFP
curl http://localhost:8080/art/add -d "title=Kandinsky.Crypto PFP" -d medium=SVG -d imgFull=kandinskyCryptoPFP.png -d imgComp=kandinskyCryptoPFP.png -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# --=== COVER ART ===--

# Behind These Eyes
curl http://localhost:8080/art/add -d "title=Behind These Eyes" -d "medium=Krita and GIMP" -d imgFull=behindTheseEyes.png -d imgComp=behindTheseEyes.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Zero Below
curl http://localhost:8080/art/add -d "title=Zero Below" -d "medium=Oil Paint, Krita, and GIMP" -d imgFull=zeroBelow.png -d imgComp=zeroBelow.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Parealustra
curl http://localhost:8080/art/add -d title=Parealustra -d "medium=Krita and GIMP" -d imgFull=parealustra.png -d imgComp=parealustra.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Silver Trees
curl http://localhost:8080/art/add -d "title=Silver Trees" -d "medium=Krita and GIMP" -d imgFull=silverTrees.png -d imgComp=silverTrees.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Two Broken Fingers
curl http://localhost:8080/art/add -d "title=Two Broken Fingers" -d "medium=Oil Paint and Photoshop" -d imgFull=twoBrokenFingers.png -d imgComp=twoBrokenFingers.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Rise Up
curl http://localhost:8080/art/add -d "title=Rise Up" -d "medium=Oil Paint and Photoshop" -d imgFull=riseUp.png -d imgComp=riseUp.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

# Regret
curl http://localhost:8080/art/add -d title=Regret -d "medium=Oil Paint and Photoshop" -d imgFull=regret.png -d imgComp=regret.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false

    # --=== PAINTINGS ===--

# Loosing Control
curl http://localhost:8080/art/add -d "title=loosing Control" -d "medium=Oil Paint" -d imgFull=loosingControl.jpg -d imgComp=loosingControl.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Chaos & Harmony
curl http://localhost:8080/art/add -d "title=Chaos and Harmony" -d "medium=India Ink" -d imgFull=chaosHarmony.jpg -d imgComp=chaosHarmony.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Mixed Emotions
curl http://localhost:8080/art/add -d "title=Mixed Emotions" -d "medium=Oil Paint" -d imgFull=mixedEmotions.jpg -d imgComp=mixedEmotions.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=true

# Sensation
curl http://localhost:8080/art/add -d title=Sensation -d "medium=Watercolor and Gauche" -d imgFull=sensation.jpg -d imgComp=sensation.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Lemon Daze
curl http://localhost:8080/art/add -d "title=Lemon Daze" -d medium=Gauche -d imgFull=lemonDaze.jpg -d imgComp=lemonDaze.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Blood Money
curl http://localhost:8080/art/add -d "title=Blood Money" -d "medium=Oil Paint" -d imgFull=bloodMoney.jpg -d imgComp=bloodMoney.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Wishy Washy
curl http://localhost:8080/art/add -d "title=Wishy Washy" -d "medium=Oil Paint" -d imgFull=wishyWashy.jpg -d imgComp=wishyWashy.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=true

# Pouring Out
curl http://localhost:8080/art/add -d "title=Pouring Out" -d "medium=India Ink" -d imgFull=pouringOut.jpg -d imgComp=pouringOut.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Still Life 4
curl http://localhost:8080/art/add -d "title=Still Life 4" -d "medium=Oil Paint" -d imgFull=stillLife4.jpg -d imgComp=stillLife4.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Lenitive
curl http://localhost:8080/art/add -d title=Lenitive -d "medium=Oil Paint" -d imgFull=lenitive.jpg -d imgComp=lenitive.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Angular Leaves
curl http://localhost:8080/art/add -d "title=Angular Leaves" -d "medium=Oil Paint" -d imgFull=angularLeaves.jpg -d imgComp=angularLeaves.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Garish Destruction
curl http://localhost:8080/art/add -d "title=Garish Destruction" -d "medium=Oil Paint and Sawdust" -d imgFull=garishDestruction.jpg -d imgComp=garishDestruction.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Muddy Waters
curl http://localhost:8080/art/add -d "title=Muddy Waters" -d "medium=Oil & Acrylic Paint" -d imgFull=muddyWaters.jpg -d imgComp=muddyWaters.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Paper Study
curl http://localhost:8080/art/add -d "title=Paper Study" -d "medium=Oil Paint" -d imgFull=paperStudy.jpg -d imgComp=paperStudy.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Space Still Life 1
curl http://localhost:8080/art/add -d "title=Space Still Life 1" -d "medium=Oil Paint" -d imgFull=spaceStillLife1.jpg -d imgComp=spaceStillLife1.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Space Still Life 2
curl http://localhost:8080/art/add -d "title=Space Still Life 2" -d "medium=Oil Paint" -d imgFull=spaceStillLife2.jpg -d imgComp=spaceStillLife2.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=true

# Spaced Out
curl http://localhost:8080/art/add -d "title=Spaced Out" -d "medium=Oil Paint" -d imgFull=spacedOut.jpg -d imgComp=spacedOut.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# With Love
curl http://localhost:8080/art/add -d "title=With Love" -d "medium=Oil Paint" -d imgFull=withLove.jpg -d imgComp=withLove.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Rise Up (pre-photoshop)
curl http://localhost:8080/art/add -d "title=Rise Up (pre-photoshop)" -d "medium=Oil Paint" -d imgFull=riseUpPre.jpg -d imgComp=riseUpPre,jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Two Broken Fingers (pre-photoshop)
curl http://localhost:8080/art/add -d "title=Two Broken Fingers (pre-photoshop)" -d "medium=Oil Paint" -d imgFull=twoBrokenFingersPre.jpg -d imgComp=twoBrokenFingersPre.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Regret (pre-photoshop)
curl http://localhost:8080/art/add -d "title=Regret (pre-photoshop)" -d "medium=Oil Paint" -d imgFull=regretPre.jpg -d imgComp=regretPre.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Regret (alternate)
curl http://localhost:8080/art/add -d "title=Regret (alternate)" -d "medium=Oil Paint" -d imgFull=regretAlt.jpg -d imgComp=regretAlt.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Parealustra (pre-photoshop)
curl http://localhost:8080/art/add -d "title=Parealustra (pre-photoshop)" -d "medium=Oil Paint" -d imgFull=parealustraPre.jpg -d imgComp=parealustraPre.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Lämp
curl http://localhost:8080/art/add -d title=Lämp -d "medium=Acrylic Paint" -d imgFull=lamp.png -d imgComp=lamp.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Cowboy
curl http://localhost:8080/art/add -d title=Cowboy -d "medium=India Ink" -d imgFull=cowboy.jpg -d imgComp=cowboy.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Implicated
curl http://localhost:8080/art/add -d title=Implicated -d "medium=India Ink" -d imgFull=implicated.jpg -d imgComp=implicated.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Still Life 2
curl http://localhost:8080/art/add -d "title=Still Life 2" -d "medium=Oil Paint" -d imgFull=stillLife2.png -d imgComp=stillLife2.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Outo
curl http://localhost:8080/art/add -d title=Outo -d "medium=India Ink" -d imgFull=outo.png -d imgComp=outo.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Mt. Hood
curl http://localhost:8080/art/add -d "title=Mt. Hood" -d "medium=India Ink" -d imgFull=mtHood.jpg -d imgComp=mtHood.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Skyliner
curl http://localhost:8080/art/add -d title=Skyliner -d medium=Watercolor -d imgFull=skyliner.png -d imgComp=skyliner.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Kismet
curl http://localhost:8080/art/add -d title=Kismet -d medium=Watercolor -d imgFull=kismet.png -d imgComp=kismet.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Vagulate
curl http://localhost:8080/art/add -d title=Vagulate -d "medium=Oil Paint" -d imgFull=vagulate.png -d imgComp=vagulate.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Turning Point
curl http://localhost:8080/art/add -d "title=Turning Point" -d "medium=Acrylic Paint" -d imgFull=turningPoint.jpg -d imgComp=turningPoint.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Mother
curl http://localhost:8080/art/add -d title=Mother -d "medium=Oil Paint" -d imgFull=mother.jpg -d imgComp=mother.jpg -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false


# --=== DRAWINGS ===--

# Iridal
curl http://localhost:8080/art/add -d title=Iridal -d medium=Chalk -d imgFull=iridal.jpg -d imgComp=iridal.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Still Life 5
curl http://localhost:8080/art/add -d "title=Still Life 5" -d "medium=Watercolor Pencils" -d imgFull=stillLife5.jpg -d imgComp=stillLife5.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Snake Eyes
curl http://localhost:8080/art/add -d "title=Snake Eyes" -d "medium=Colored Pencils" -d imgFull=snakeEyes.jpg -d imgComp=snakeEyes.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Focus
curl http://localhost:8080/art/add -d title=Focus -d "medium=Oil Pens" -d imgFull=focus.jpg -d imgComp=focus.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Genesis
curl http://localhost:8080/art/add -d title=Genesis -d "medium=Oil Pens" -d imgFull=genesis.jpg -d imgComp=genesis.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Besties
curl http://localhost:8080/art/add -d title=Besties -d "medium=Oil Pens" -d imgFull=besties.jpg -d imgComp=besties.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Headlines
curl http://localhost:8080/art/add -d title=Headlines -d "medium=Oil Pens and Markers" -d imgFull=headlines.jpg -d imgComp=headline.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Dark Times
curl http://localhost:8080/art/add -d "title=Dark Times" -d "medium=Oil Pens and Markers" -d imgFull=darkTimes.jpg -d imgComp=darkTimes.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# LUV
curl http://localhost:8080/art/add -d title=LUV -d "medium=Oil Pens and Markers" -d imgFull=luv.jpg -d imgComp=luv.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Fierce
curl http://localhost:8080/art/add -d title=Fierce -d "medium=Oil Pens" -d imgFull=fierce.jpg -d imgComp=fierce -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Bright Eyed
curl http://localhost:8080/art/add -d "title=Bright Eyed" -d "medium=Oil pens" -d imgFull=brightEyed.jpg -d imgComp=brighteyed.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Kandinskeye
curl http://localhost:8080/art/add -d title=Kandinskeye -d "medium=Oil pens and Markers" -d imgFull=kandinskeye.jpg -d imgComp=kandinskeye.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Coffee
curl http://localhost:8080/art/add -d title=Coffee -d "medium=Colored Pencil" -d imgFull=coffee.jpg -d imgComp=coffee.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Enchanted Tree
curl http://localhost:8080/art/add -d "title=Enchanted Tree" -d "medium=Watercolor Pencils" -d imgFull=enchantedTree.jpg -d imgComp=enchantedTree.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Self Portrait
curl http://localhost:8080/art/add -d "title=Self Portrait" -d "medium=Ink and Colored Pencil" -d imgFull=selfPortrait.jpg -d imgComp=selfPortrait -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Still Life 1
curl http://localhost:8080/art/add -d "title=Still Life 1" -d "medium=Colored Pencils" -d imgFull=stillLife1.png -d imgComp=stillLife1.png -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Arm Anatomy
curl http://localhost:8080/art/add -d "title=Arm Anatomy" -d medium=Pen -d imgFull=armAnatomy.png -d imgComp=armAnatomy.png -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Doodle
curl http://localhost:8080/art/add -d title=Doodle -d medium=Graphite -d imgFull=doodle.jpg -d imgComp=doodle.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# I.M.Y.J.
curl http://localhost:8080/art/add -d "title=I.M.Y.J." -d medium=Ink -d imgFull=imyj.jpg -d imgComp=imyj.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Metallic Study 1
curl http://localhost:8080/art/add -d "title=Metallic Study 1" -d "medium=Colored Pencil" -d imgFull=metallicStudy1.jpg -d imgComp=metallicStudy1.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Metallic Study 2
curl http://localhost:8080/art/add -d "title=Metallic Study 2" -d "medium= Colored Pencil" -d imgFull=metallicStudy2.jpg -d imgComp=metallicStudy2.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# All Around
curl http://localhost:8080/art/add -d "title=All Around" -d "medium=Colored Pencil and Ink" -d imgFull=allAround.jpg -d imgComp=allAround.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Light Study
curl http://localhost:8080/art/add -d "title=Light Study" -d "medium=Graphite and Colored Pencil" -d imgFull=lightStudy.jpg -d imgComp=lightStudy.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Watercolor Pencil Study
curl http://localhost:8080/art/add -d "title=Watercolor Pencil Study" -d "medium=Watercolor Pencil" -d imgFull=watercolorPencilStudy.jpg -d imgComp=watercolorPencilStudy.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Redrun
curl http://localhost:8080/art/add -d title=Redrun -d medium=Ink -d imgFull=redrun.jpg -d imgComp=redrun.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Adventure
curl http://localhost:8080/art/add -d title=Adventure -d medium=Graphite -d imgFull=adventure.jpg -d imgComp=adventure.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

#Balance
curl http://localhost:8080/art/add -d title=Balance -d medium=Ink -d imgFull=balance.jpg -d imgComp=balance.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Abstract Self Portrait WIP
curl http://localhost:8080/art/add -d "title=Abstract Self Portrait (WIP)" -d medium=Graphite -d imgFull=abstractSelfPortraitPre.jpg -d imgComp=abstractSelfPortraitPre.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Old Self Portrait
curl http://localhost:8080/art/add -d "title=Old Self Portrait" -d medium=Graphite -d imgFull=oldSelfPortrait.jpg -d imgComp=oldSelfPortrait.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Oldest Self Portrait
curl http://localhost:8080/art/add -d "title=Oldest Self Portrait" -d medium=Graphite -d imgFull=oldestSelfPortrait.jpg -d imgComp=oldestSelfPortrait.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Recess
curl http://localhost:8080/art/add -d title=Recess -d "medium=Oil Pastel" -d imgFull=recess.jpg -d imgComp=recess.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Still Life 3
curl http://localhost:8080/art/add -d "title=Still Life 3" -d medium=Graphite -d imgFull=stillLife3.jpg -d imgComp=stillLife3.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Mountains
curl http://localhost:8080/art/add -d title=Mountains -d "medium=Oil Pastel" -d imgFull=mountains.jpg -d imgComp=mountains.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Nikes on My Feet
curl http://localhost:8080/art/add -d "title=Nikes on My Feet" -d medium=Graphite -d imgFull=nikesOnMyFeet.jpg -d imgComp=nikesOnMyFeet.jpg -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false


# --=== OTHER ART ===--

# Abstract Self Portrait
curl http://localhost:8080/art/add -d "title=Abstract Self Portrait" -d medium=Collage -d imgFull=abstractSelfPortrait.jpg -d imgComp=abstractSelfPortrait.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Tortuous
curl http://localhost:8080/art/add -d title=tortuous -d medium=Ceramic -d imgFull=tortuous.jpg -d imgComp=tortuous.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Tempest
curl http://localhost:8080/art/add -d title=Tempest -d "medium=Linoleum Carving" -d imgFull=tempest.jpg -d imgComp=tempest.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Ryan (print)
curl http://localhost:8080/art/add -d "title=Ryan (print)" -d "medium=Linoleum Print" -d imgFull=ryan.jpg -d imgComp=ryan.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Ryan (carving)
curl http://localhost:8080/art/add -d "title=Ryan (carving)" -d "medium=Linoleum Carving" -d imgFull=ryanCarving.jpg -d imgComp=ryanCarving.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Squirrelly
curl http://localhost:8080/art/add -d title=Squirrelly -d medium=Collage -d imgFull=squirrelly.jpg -d imgComp=squirrelly.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Broché
curl http://localhost:8080/art/add -d title=Broché -d medium=Collage -d imgFull=broche.jpg -d imgComp=broche.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Waste
curl http://localhost:8080/art/add -d title=Waste -d medium=Collage -d imgFull=waste.jpg -d imgComp=waste.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Pieces
curl http://localhost:8080/art/add -d title=Pieces -d medium=Collage -d imgFull=pieces.jpg -d imgComp=pieces.jpg -d type=trad -d category=other -d height=0 -d width=0 -d feature=false


# ================= EXTRA TEST ITEMS =================

# Test Image 1 [paint]
#curl http://localhost:8080/art/add -d "title=Test Image 1" -d medium=testPaint -d imgFull=testImg.png -d imgComp=testImg.png -d type=trad -d category=paint -d height=0 -d width=0 -d feature=false

# Test Image 2 [draw]
#curl http://localhost:8080/art/add -d "title=Test Image 2" -d medium=testDraw -d imgFull=testImg.png -d imgComp=testImg.png -d type=trad -d category=draw -d height=0 -d width=0 -d feature=false

# Test Image 3 [other]
#curl http://localhost:8080/art/add -d "title=Test Image 3" -d medium=testOther -d imgFull=testImg.png -d imgComp=testImg.png -d type=trad -d category=other -d height=0 -d width=0 -d feature=false

# Test Image 4 [logo]
#curl http://localhost:8080/art/add -d "title=Test Image 4" -d medium=testLogo -d imgFull=testImg.png -d imgComp=testImg.png -d type=digi -d category=logo -d height=0 -d width=0 -d feature=false

# Test Image 5 [cover]
#curl http://localhost:8080/art/add -d "title=Test Image 5" -d medium=testCover -d imgFull=testImg.png -d imgComp=testImg.png -d type=digi -d category=cover -d height=0 -d width=0 -d feature=false
