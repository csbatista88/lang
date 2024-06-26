log_msg() {
    RED=$(tput setaf 1)
    GREEN=$(tput setaf 2)
    NORMAL=$(tput sgr0)
    MSG="$1"
    let COL=$(tput cols)-${#MSG}+${#GREEN}+${#NORMAL}
    printf "%s%${COL}s" "$MSG" "$GREEN[OK]$NORMAL"
}
log_msg $1
