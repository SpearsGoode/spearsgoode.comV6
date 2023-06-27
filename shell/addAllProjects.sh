#!/bin/bash

# Abstract-Artwork.com
curl http://localhost:8080/projects/add -d title=Abstract-Artwork.com -d tag=abstract -d "date=Completed: April 2019" -d img=abstract-artwork.jpg -d "alt=Abstract-Artwork.com home page screenshot" -d link=https://archive.spearsgoode.com/abstract-artwork.com -d "intro=Haven for Abstract Artists. View abstract artwork from around the globe, meet other abstract artists, and find out what inspires them." -d info=abstract

# Ape Armada DAO
curl http://localhost:8080/projects/add -d "title=Ape Armada DAO" -d tag=armada -d "date=Discontinued: October 2022" -d img=ape_soldier.jpg -d "alt=Ape Armada Ape Soldier" -d link=null -d "intro=A Play to Earn, Multiplayer, First Person Shooter designed to tackle significant problems concerning the design of current generation Play to Earn (P2E) games" -d info=armada

# aHODLm Indicator
curl http://localhost:8080/projects/add -d "title=aHODLm Indicator" -d tag=aHODLm -d "date=Shelved: August 2020" -d img=aHODLm.jpg -d "alt=aHODLm indicator BTC example" -d link=null -d "intro=Detects likelihood of significant movements. At points of high risk it takes profit and at points of low risk it increases the position size. Since its inception it has proven its ability to swing trade effectively with minimal oversight." -d info=aHODLm

# SpearsGoode.com
curl http://localhost:8080/projects/add -d title=SpearsGoode.com -d tag=sg -d date=Ongoing -d img=SGlogoV2tall.svg -d "alt=Spears Goode Logo" -d link=https://archive.spearsgoode.com/ -d "intro=My personal website that displays important projects and artwork I've created. The motivation behind this project was initially to document my web development journey and store my artwork. Previous versions are available in the archive." -d info=sg
