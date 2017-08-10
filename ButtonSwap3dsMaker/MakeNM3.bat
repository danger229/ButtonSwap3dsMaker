make clean
make
cd meta
bannertool makesmdh -s "3DS Rebind" -l "Rebinds some buttons" -p "Danger229's Rebind Maker Program" -i icon.png -o App.smdh
bannertool makebanner -i  -a  -o  Banner.bin
move Banner.bin ..\
move App.smdh ..\
copy cia.rsf ..\
cd ..\
makerom -f cia -o  -rsf cia.rsf -target t -exefslogo -elf ButtonSwap3DS-master.elf -icon App.smdh -banner Banner.bin
del banner.bin
del App.smdh
del cia.rsf
