import React, { useState } from "react";

function App() {
  const [presses, setPresses] = useState(0);

  const handlePress = () => {
    setPresses(presses + 1);
  };

  return (
    <div>
      <h1>Press the button</h1>
      <p>Button has been pressed {presses} times</p>
      <button onClick={handlePress}>The button</button>
    </div>
  );
}

export default App;
