#!/usr/bin/env node

const cp = require('child_process');
const path = require('path');
const argv = process.argv.slice(2)

if (argv[0] === "integration") {
    watchRunner(["-e unit-tests"]);
    watchRunner(["-e", "chrome", "firefox", "-t", argv[0]]);
} else if(argv.length === 0){
    watchRunner(["-e", "chrome", "firefox"])
} else {
    watchRunner(["-e", "chrome", "firefox", "-t", argv[0]]);
}

function watchRunner(args = []) {
    console.log(args);
    let dirPath = path.join("./node_modules", ".bin");
    let command = process.platform === 'win32' ? path.join(dirPath, "nightwatch.cmd") : path.join(dirPath, "nightwatch.sh");
    let opts = ["-c", "conf/nightwatch.conf.js"].concat(argv)
    console.log(command + "\t" + opts);
    const child = cp.spawn(command, opts);
    child.stdin.on('data', (data) => console.log(`stdin: ${data}`));
    child.stdout.on('data', (data) => {
        console.log(`stdout: ${data}`);
    });

    child.stderr.on('data', (data) => {
        console.error(`stderr: ${data}`);
    });

    child.on('close', (code) => {
        console.log(`Process exited with code ${code}`);
    });
}