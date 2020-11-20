#!/usr/bin/env node

const cp = require('child_process');
const path = require('path');
const argv = process.argv.slice(2)

console.log(argv);
let dirPath = path.join("./node_modules", ".bin");
let command = process.platform === 'win32' ? path.join(dirPath, "nightwatch.cmd") : path.join(dirPath, "nightwatch.sh");
console.log(command)
let args = ["-c", "conf/nightwatch.conf.js"].concat(argv)
console.log(args);

cp.spawn(command, args);


