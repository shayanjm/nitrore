(ns nitrore.rescan)

(def char->category* {\space :eof
                      \newline :eol
                      \* :star
                      \+ :plus
                      \| :pipe
                      \( :lparen
                      \) :rparen})

(def escape-sequence* {\0 \u0000
                       \b \backspace
                       \t \tab
                       \n \newline
                       \f \formfeed
                       \r \return})


;; (defn lex
;;   "Lexes single token. Takes character, returns token"
;;   [c]
;;   )
